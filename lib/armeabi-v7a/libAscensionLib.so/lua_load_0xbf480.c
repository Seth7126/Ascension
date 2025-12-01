// 函数: lua_load
// 地址: 0xbf480
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void var_30
sub_e1074(arg1, &var_30, arg2, arg3)
int32_t result
int128_t q4
result, q4 = sub_c9f9c(arg1, &var_30)

if (result == 0)
    void* r6_1 = *(arg1[2] - 0x10)
    
    if (zx.d(*(r6_1 + 6)) == 1)
        int32_t r10
        int32_t* r0_7 = sub_db664(*(arg1[3] + 0x28), 2, r10, q4)
        int32_t* r1_3 = *(*(r6_1 + 0x10) + 8)
        int32_t r3_2 = r0_7[1]
        *r1_3 = *r0_7
        r1_3[1] = r3_2
        r1_3[2] = r0_7[2]
        
        if ((zx.d(r0_7[2].b) & 0x40) != 0)
            void* r2_5 = *r0_7
            
            if ((zx.d(*(r2_5 + 5)) & 3) != 0)
                void* r1_5 = *(r6_1 + 0x10)
                
                if ((zx.d(*(r1_5 + 5)) & 4) != 0)
                    sub_cade0(arg1, r1_5, r2_5)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
