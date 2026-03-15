package oop_115708_DominikusDylon.Week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout . . . ")
    method.pay(amount)
}

fun main(){
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)


    println("\n======SMARTHOME ENVIRONMENT======")
    val lamp = SmartLamp("L01", "RuangTamu")
    val smartSpeaker = SmartSpeaker("S01", "Google Nest Dapur")
    val SmartCCTV = SmartCCTV("C01", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(smartSpeaker)
    hub.addDevice(SmartCCTV)

    hub.activateSecurityMode()

    hub.turnOffAllSwitches()
}