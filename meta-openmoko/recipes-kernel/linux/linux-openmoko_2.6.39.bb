require recipes-kernel/linux/linux.inc
require linux-openmoko.inc

# Mark archs/machines that this kernel supports
DEFAULT_PREFERENCE = "-1"
DEFAULT_PREFERENCE_om-gta02 = "1"
DEFAULT_PREFERENCE_om-gta01 = "1"

# for bumping PR bump MACHINE_KERNEL_PR in the machine config
inherit machine_kernel_pr

SRCREV = "f7345ab5cf2f17625779a017ba3959679ba2d054"

SRC_URI = " \
    git://github.com/shr-distribution/linux.git;protocol=https;branch=${MACHINE}/${PV}/master \
    file://defconfig \
"  

S = "${WORKDIR}/git"
