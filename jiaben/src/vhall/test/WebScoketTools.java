package vhall.test;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_17;
import org.java_websocket.handshake.ServerHandshake;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebScoketTools {

	public String webUrl = "http://t.e.vhall.com/363527253";
	public String msgServer = "msg01.e.vhall.com";
	public static int numberOfPeople = 300;//
	public static int sleepTimes = 10;//

	private WebSocketClient cc;

	public static void main(String[] args) {

		for (int i = 0; i < numberOfPeople; i++) {

			Runner r = new Runner();
			Thread t = new Thread(r);

			t.start();

		}

	}

	void action() throws InterruptedException, IOException {

		try {
			cc = new WebSocketClient(new URI("ws://" + msgServer + "/socket.io/?token=" + this.getToken()
					+ "&app=vhall&EIO=3&transport=websocket"), new Draft_17()) {

				@Override
				public void onMessage(String message) {

					System.out.println(message);
				}

				@Override
				public void onOpen(ServerHandshake handshake) {

				}

				@Override
				public void onClose(int code, String reason, boolean remote) {

				}

				@Override
				public void onError(Exception ex) {
					System.out.println(ex);

				}
			};

			cc.connect();
		} catch (URISyntaxException e1) {

			e1.printStackTrace();
		}

		Thread.sleep(sleepTimes * 1000);
		cc.close();
	}

	String getToken() throws IOException {

		URL url = new URL(webUrl);

		HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

		BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

		String line;

		StringBuffer buffer = new StringBuffer();

		while ((line = reader.readLine()) != null) {
			buffer.append(line);
		}

		String regex = "\\bmsg_token':\\s'([^\']*)";
		String MsgToken = null;
		Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
		Matcher matcher = null;
		// String result = null;
		matcher = pattern.matcher(buffer);

		while (matcher != null && matcher.find()) {
			MsgToken = matcher.group().replace("msg_token': '", "");

		}
		return MsgToken;

	}

}

class Runner implements Runnable {

	public void run() {
		// TODO Auto-generated method stub

		WebScoketTools wst = new WebScoketTools();

		try {
			wst.action();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
