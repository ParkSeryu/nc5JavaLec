package chap11_interface.product;

public interface TV extends Display, Speaker{
	void changeChannel(int channel);
}
