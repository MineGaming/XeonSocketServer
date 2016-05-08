package de.nlinz.system.server.eva.server;

import java.io.ByteArrayOutputStream;

public class SocketDataEvent {
	private ConnectedClient mess;
	private String channel;
	private byte[] bytes;

	public SocketDataEvent(final ConnectedClient mess, final String channel, final byte[] bytes) {
		this.mess = mess;
		this.channel = channel;
		this.bytes = bytes;
	}

	public String getChannel() {
		return this.channel;
	}

	public byte[] getStreamBytes() {
		return this.bytes;
	}

	public ConnectedClient getMessenger() {
		return this.mess;
	}

	public void sendDataBack(final ByteArrayOutputStream bytes) {
		this.mess.write(bytes);
	}

}