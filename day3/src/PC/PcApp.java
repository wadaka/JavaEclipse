package PC;

public class PcApp {
	public static void main(String[] args) {
		Pc pc = new Pc();
		pc.setUsb(new USBMemory());
		pc.executeUSB();
		pc.setUsb(new USBFun());
		pc.executeUSB();
		pc.setUsb(new USBCarNavi());
		pc.executeUSB();
	}
}

class USBMemory implements IUSB {
	@Override
	public void execute() {
		System.out.println("データを保存する");
	}
}

class USBFun implements IUSB {
	@Override
	public void execute() {
		System.out.println("涼しい風を送る");
	}
}
class USBCarNavi implements IUSB{
	@Override
	public void execute() {
		System.out.println("次の信号を左です");
	}
}