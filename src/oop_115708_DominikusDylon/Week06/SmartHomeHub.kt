package oop_115708_DominikusDylon.Week06

class SmartHomeHub(val devices: MutableList<smartDevice> = mutableListOf()) {
    fun addDevice(device: smartDevice){
        devices.add(device)
    }

    fun turnOffAllSwitches(){
        for(device in devices){
            if (device is Switchable){
                device.turnOff()
            }
        }
    }
}