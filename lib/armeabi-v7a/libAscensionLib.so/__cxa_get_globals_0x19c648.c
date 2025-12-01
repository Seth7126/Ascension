// 函数: __cxa_get_globals
// 地址: 0x19c648
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* result_1 = __cxa_get_globals_fast()
void* result = result_1

if (result_1 == 0)
    void* result_2
    int32_t r1_1
    result_2, r1_1 = sub_19d190(1, 0xc)
    int32_t r1_3
    
    if (result_2 == 0)
        r1_3 = sub_19e110("cannot allocate __cxa_eh_globals", r1_1)
    label_19c67e:
        int32_t r0_3
        int32_t r2
        r0_3, r2 = sub_19e110("std::__libcpp_tls_set failure in __cxa_get_globals()", r1_3)
        int32_t arg_1a0 = r2
        return __cxa_get_globals_fast() __tailcall
    
    result = result_2
    int32_t r0_1
    r0_1, r1_3 = pthread_setspecific(data_1f58d4, result)
    
    if (r0_1 != 0)
        goto label_19c67e

return result
