package com.bytelegend;

public class Computer {
    /**
     * The CPU model, required.
     */
    private final String cpu;
    /**
     * The RAM model, required.
     */
    private final String ram;
    /**
     * The motherboard model, required.
     */
    private final String motherboard;
    /**
     * The storage model, optional.
     */
    private final String storage;
    /**
     * The display model, optional.
     */
    private final String display;
    /**
     * The keyboard model, optional.
     */
    private final String keyboard;
    /**
     * The mouse model, optional.
     */
    private final String mouse;
    /**
     * The speaker model, optional.
     */
    private final String speaker;
    /**
     * The battery model, optional.
     */
    private final String battery;

    public Computer(String cpu, String ram, String motherboard) {
        this(cpu, ram, motherboard, null);
    }

    public Computer(String cpu, String ram, String motherboard, String storage) {
        this(cpu, ram, motherboard, storage, null);
    }

    public Computer(String cpu, String ram, String motherboard, String storage, String display) {
        this(cpu, ram, motherboard, storage, display, null);
    }

    public Computer(String cpu, String ram, String motherboard, String storage, String display, String keyboard) {
        this(cpu, ram, motherboard, storage, display, keyboard, null);
    }

    public Computer(String cpu, String ram, String motherboard, String storage, String display, String keyboard, String mouse) {
        this(cpu, ram, motherboard, storage, display, keyboard, mouse, null);
    }

    public Computer(String cpu, String ram, String motherboard, String storage, String display, String keyboard, String mouse, String speaker) {
        this(cpu, ram, motherboard, storage, display, keyboard, mouse, speaker, null);
    }

    public Computer(String cpu, String ram, String motherboard, String storage, String display, String keyboard, String mouse, String speaker, String battery) {
        this.cpu = cpu;
        this.ram = ram;
        this.motherboard = motherboard;
        this.storage = storage;
        this.display = display;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.speaker = speaker;
        this.battery = battery;
    }

    public static void main(String[] args) {
        Computer computer = Computer.builder("Intel", "16GB", "Asus")
                                    .withStorage("1TB")
                                    .withDisplay("15.6")
                                    .withKeyboard("USB")
                                    .withMouse("USB")
                                    .withSpeaker("USB")
                                    .withBattery("Li-ion")
                                    .build();
        System.out.println(computer);
    }

    public static ComputerBuilder builder(String cpu, String ram, String motherboard) {
        return ComputerBuilder.aComputer().withCpu(cpu).withRam(ram).withMotherboard(motherboard);
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getStorage() {
        return storage;
    }

    public String getDisplay() {
        return display;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public String getSpeaker() {
        return speaker;
    }

    public String getBattery() {
        return battery;
    }

    @Override
    public String toString() {
        return "Computer{" + "cpu=" + cpu + ", ram=" + ram + ", motherboard=" + motherboard + ", storage=" + storage + ", display=" + display + ", keyboard=" + keyboard + ", mouse=" + mouse + ", speaker=" + speaker + ", battery=" + battery + '}';
    }

    public static final class ComputerBuilder {
        private String cpu;
        private String ram;
        private String motherboard;
        private String storage;
        private String display;
        private String keyboard;
        private String mouse;
        private String speaker;
        private String battery;

        private ComputerBuilder() {
        }

        public static ComputerBuilder aComputer() {
            return new ComputerBuilder();
        }

        public ComputerBuilder withCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder withRam(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder withMotherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public ComputerBuilder withStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder withDisplay(String display) {
            this.display = display;
            return this;
        }

        public ComputerBuilder withKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public ComputerBuilder withMouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        public ComputerBuilder withSpeaker(String speaker) {
            this.speaker = speaker;
            return this;
        }

        public ComputerBuilder withBattery(String battery) {
            this.battery = battery;
            return this;
        }

        public Computer build() {
            return new Computer(cpu, ram, motherboard, storage, display, keyboard, mouse, speaker, battery);
        }
    }
}


