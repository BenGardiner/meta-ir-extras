DESCRIPTION = "A USB man in the middle device using USB On-The-Go, libUSB and gadgetFS " 
BUGTRACKER = "http://bugzilla.yoctoproject.org/"
PR = "r0"

LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1484b9683e3fc1dd9f5cf802a23fe67c"

SRCREV = "0704ec6c7e8d0d669348e30888cb56cf57bb4324"

SRC_URI = "git://github.com/potjaune/USBProxy.git;branch=rate-limit-inject \
	file://0001-Cmake.patch"

S = "${WORKDIR}/git"

inherit pkgconfig cmake

RDEPENDS_${PN} = "python3-modules python3-core python3-misc"

FILES_${PN} = "${prefix}/bindings/python/USBProxy/*.py \
               ${libdir}/USBProxy \
               ${libdir}/libUSBProxy.so.0 \
               ${libdir}/libUSBProxyAPI.so.0.1 \
               ${libdir}/libUSBProxy.so.0.1 \
               ${libdir}/libUSBProxyAPI.so.0 \
               ${bindir}/usb-mitm \
               ${bindir}/uinputme \
               ${bindir}/timerinputme"

