/****************************************************************************
 * pss2xml.cpp
 *
 * Wrapper around the PSS2XML tool, which is Java based
 ****************************************************************************/

#if defined(_WIN32) || defined(__CYGWIN__)
#define PS ';'
#else
#define PS ':'
#endif

#include <string>
#include <stdio.h>
#include <ctype.h>

std::string dirname(const std::string &path) {
	std::size_t fs_idx = path.rfind('/');

	if (fs_idx != std::string::npos) {
		return path.substr(0, fs_idx);
	} else {
		return "";
	}
}

std::string find_exe(const std::string &exe) {
	std::string dir = dirname(exe);

	if (dir.size() > 3 && (dir.at(0) == '/' || (
			isalpha(dir.at(0)) && dir.at(1) == ':' && dir.at(2) == '/'))) {
		// Absolute path
	} else {
		if (dir == "") {
			// We might have something from PATH
		} else {
			// We either have an absolute path or a relative one
		}
	}
	return exe;
}

std::string normalize(const std::string &path) {
	std::string ret(path);

//	for (uint32_t i=0; i<ret.size(); i++) {
//		if (ret.at(i) == '\\') {
//			ret.replace(i, "/", 1);
//		}
//	}

	return ret;
}

int main(int argc, char **argv) {

	// First, locate where we're installed
	std::string exe = find_exe(normalize(argv[0]));

	fprintf(stdout, "exe: %s\n", exe.c_str());

}
