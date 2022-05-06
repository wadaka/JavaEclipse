package pcapp;

public class PcApp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		PC pc = new PC();
		;UsbMemory usbMemory = new UsbMemory();
		pc.executeUSB(new UsbMemory());
		pc.executeUSB(new IUsb() {
			@Override
			public void execute() {
				System.out.println("扇風機を回します");
			}
		});
	}

}
interface IUsb{
	void execute();
}
class PC{
	void executeUSB(IUsb usb) {
		usb.execute();
	}
}
class UsbMemory implements IUsb{
	@Override
	public void execute() {
		System.out.println("メモリに書き込みます");
	}
}