LOCAL_CFLAGS :=-D__GXX_EXPERIMENTAL_CXX0X__
LOCAL_CPPFLAGS  := -std=c++11
LOCAL_CFLAGS += -std=gnu++11

LOCAL_PATH := $(call my-dir)
APP_STL := c++_static

include $(CLEAR_VARS)

LOCAL_MODULE    := sayhello
LOCAL_SRC_FILES := sayhello.cpp\


include $(BUILD_SHARED_LIBRARY)

LOCAL_LDLIBS += -llog -llandroid -llc++_shared