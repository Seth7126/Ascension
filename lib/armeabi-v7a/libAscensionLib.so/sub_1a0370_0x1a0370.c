// 函数: sub_1a0370
// 地址: 0x1a0370
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r3
int32_t var_14_1 = r3
void* var_18 = arg3
int32_t r0 = *__stack_chk_guard
char* r0_1 = *arg1
int32_t r2 = arg1[1]
int32_t result

if (r0_1 == r2 || zx.d(*r0_1) != 0x44)
    result = 0
else
    *arg1 = &r0_1[1]
    
    if (&r0_1[1] == r2)
        result = 0
    else
        uint32_t r2_1 = zx.d(r0_1[1])
        bool cond:0_1 = r2_1 != 0x74
        
        if (r2_1 != 0x74)
            cond:0_1 = zx.d(r0_1[1]) != 0x54
        
        if (cond:0_1)
            result = 0
        else
            *arg1 = &r0_1[2]
            void* r0_4 = sub_1a09b8(arg1)
            var_18 = r0_4
            
            if (r0_4 == 0)
                result = 0
            else
                char* r0_5 = *arg1
                
                if (r0_5 == arg1[1] || zx.d(*r0_5) != 0x45)
                    result = 0
                else
                    *arg1 = &r0_5[1]
                    result = sub_1a1be8(arg1, "decltype(", &var_18)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
