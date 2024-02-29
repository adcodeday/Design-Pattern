package 结构型模式.外观模式;

import 结构型模式.外观模式.子系统.CPU;
import 结构型模式.外观模式.子系统.HardDrive;
import 结构型模式.外观模式.子系统.Memory;

public class AppearanceClass implements Appearance{
    private CPU cpu=new CPU();
    private HardDrive hardDrive=new HardDrive();
    private Memory memory=new Memory();
    @Override
    public void open() {
        cpu.on();
        hardDrive.on();
        memory.on();
    }

    @Override
    public void close() {
        cpu.off();
        hardDrive.off();
        memory.off();
    }
}
