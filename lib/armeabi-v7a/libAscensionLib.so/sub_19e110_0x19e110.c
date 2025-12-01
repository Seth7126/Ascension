// 函数: sub_19e110
// 地址: 0x19e110
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t var_c = arg2
int32_t r2
int32_t var_8 = r2
int32_t r3
int32_t var_4 = r3
int32_t* var_28 = &var_c
vfprintf(__sF + 0xa8, arg1, &var_c)
fputc(0xa, __sF + 0xa8)
char* var_2c
vasprintf(&var_2c, arg1, &var_c)
int32_t r0_2
int32_t r3_2
r0_2, r3_2 = __assert2(
    "/buildbot/src/android/ndk-release-r19/external/libcxx/../../external/libcxxabi/src/abort_message.cpp", 
    0x49, "abort_message", var_2c, &var_c)
return std::set_unexpected(r0_2) __tailcall
