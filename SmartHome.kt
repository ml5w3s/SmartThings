class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {

    var deviceTurnOnCount = 0
        private set

    private fun isDeviceOn(device: SmartDevice): Boolean {
        return device.deviceStatus == "on"
    }

    fun turnOnTv() {
        if (isDeviceOn(smartTvDevice)) {
            deviceTurnOnCount++
            smartTvDevice.turnOn()
        }
    }

    fun turnOffTv() {
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume() {
        if (isDeviceOn(smartTvDevice)) {
            smartTvDevice.increaseSpeakerVolume()
        }
    }

    fun changeTvChannelToNext() {
        if (isDeviceOn(smartTvDevice)) {
            smartTvDevice.nextChannel()
        }
    }

    fun turnOnLight() {
        if (isDeviceOn(smartLightDevice)) {
            deviceTurnOnCount++
            smartLightDevice.turnOn()
        }
    }

    fun turnOffLight() {
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        if (isDeviceOn(smartLightDevice)) {
            smartLightDevice.increaseBrightness()
        }
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }

}
