#include <stdio.h>

extern "C"{
	typedef void (*OpenFunc)(const char*,int);
	void init(OpenFunc func);
	void test();
}
