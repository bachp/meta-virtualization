SUMMARY = "Multi-container orchestration for Docker"
HOMEPAGE = "https://www.docker.com/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435b266b3899aa8a959f17d41c56def8"

inherit pypi setuptools3

SRC_URI[md5sum] = "4da78bfb39f494f65d57c6efe581c4fd"
SRC_URI[sha256sum] = "2930cbfe2685018fbb75377600ab6288861d9955717b3f14212f63950351d379"

PROVIDES = "docker-compose"
RPROVIDES_${PN} = "docker-compose"

RDEPENDS_${PN} = "\
  ${PYTHON_PN}-cached-property \
  ${PYTHON_PN}-certifi \
  ${PYTHON_PN}-chardet \
  ${PYTHON_PN}-colorama \
  ${PYTHON_PN}-docker \
  ${PYTHON_PN}-docker-pycreds \
  ${PYTHON_PN}-dockerpty \
  ${PYTHON_PN}-docopt \
  ${PYTHON_PN}-enum \
  ${PYTHON_PN}-idna \
  ${PYTHON_PN}-jsonschema \
  ${PYTHON_PN}-pyyaml \
  ${PYTHON_PN}-requests \
  ${PYTHON_PN}-six \
  ${PYTHON_PN}-texttable \
  ${PYTHON_PN}-urllib3 \
  ${PYTHON_PN}-websocket-client \
  "
