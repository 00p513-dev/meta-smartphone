require recipes-core/android-system-image/android-system-image.inc

COMPATIBLE_MACHINE = "sargo"

PV = "20240307-1"

SRC_URI = "https://github.com/webOS-ports/halium-images/releases/download/halium-luneos-9.0-20240307-1-sargo.tar.bz2/halium-luneos-9.0-20240307-1-sargo.tar.bz2"
SRC_URI[sha256sum] = "5f80cedb6cc0d63407125a04b936ee330873ea2f1ed4c93d2dc105a512b8ffb0"

ANDROID_SYSTEM_IMAGE_DESTNAME = "android-rootfs.img"
