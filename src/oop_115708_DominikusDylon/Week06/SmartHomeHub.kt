package oop_115708_DominikusDylon.Week06

import java.security.Security

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

    fun activateSecurityMode(){
        for (device in devices){
            if (device is Recordable){
                device.startRecord()
            }
            if (device is SmartSpeaker){
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}