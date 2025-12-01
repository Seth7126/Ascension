// 函数: __cxa_end_catch
// 地址: 0x19c3a8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t* r0 = __cxa_get_globals_fast()
int32_t* result = *r0

if (result != 0)
    int32_t r2_1 = result[0xa]
    int32_t r3_1 = result[0xb]
    
    if ((((r2_1 u>> 8 | r3_1 << 0x18) ^ 0x47432b2b) | (0x434c4e ^ r3_1 u>> 8)) != 0)
        sub_1a8790(&result[0xa])
        result = nullptr
        *r0 = result
    else
        int32_t r1_3 = result[6]
        
        if (r1_3 s<= 0xffffffff)
            result[6] = r1_3 + 1
            
            if (r1_3 == 0xffffffff)
                result = result[5]
                *r0 = result
        else
            result[6] = r1_3 - 1
            
            if (r1_3 == 1)
                *r0 = result[5]
                uint32_t r1_6 = zx.d(r2_1.b)
                
                if (r1_6 == 1)
                    int32_t r4_1 = *result
                    sub_19d1c4(result, r1_6)
                    result = r4_1 - 0x80
                
                return __cxa_decrement_exception_refcount(&result[0x20]) __tailcall

return result
