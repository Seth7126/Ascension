// 函数: __cxa_get_globals_fast
// 地址: 0x19c690
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0
int32_t r1
r0, r1 = pthread_once(0x1f58d8, 0x19c6c5)

if (r0 == 0)
    data_1f58d4
    return sub_1a9ebc() __tailcall

int32_t r0_3
int32_t r2_1
int32_t lr_1
r0_3, r2_1, lr_1 = sub_19e110("execute once failure in __cxa_get_globals_fast()", r1)
int32_t arg_d0 = r2_1
int32_t var_14 = lr_1
int32_t* var_18 = &data_1f58d4
int32_t r0_4
int32_t r1_2
r0_4, r1_2 = pthread_key_create(&data_1f58d4, 0x19c6ed)

if (r0_4 == 0)
    return r0_4

int32_t r0_5
int32_t __saved_r7_1
int32_t lr_2
r0_5, __saved_r7_1, lr_2 =
    sub_19e110("cannot create thread specific key for __cxa_get_globals()", r1_2)
int32_t __saved_r7 = __saved_r7_1
int32_t var_1c = lr_2
int32_t** var_20 = &var_18
sub_19d2a4(r0_5)
int32_t r0_8
int32_t r1_3
r0_8, r1_3 = pthread_setspecific(data_1f58d4, 0)

if (r0_8 == 0)
    return r0_8

int32_t r0_9
int32_t r1_4
r0_9, r1_4 = sub_19e110("cannot zero out thread value for __cxa_get_globals()", r1_3)
int32_t arg_340 = r1_4
return std::get_unexpected() __tailcall
