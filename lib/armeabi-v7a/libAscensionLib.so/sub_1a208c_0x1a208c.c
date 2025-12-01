// 函数: sub_1a208c
// 地址: 0x1a208c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard

if (sub_19e5e0(arg1, "fp", 0x1cfffb) != 0)
    goto label_1a20b2

void* result

if (sub_19e5e0(arg1, "fL", 0x1cfffe) == 0)
    result = nullptr
else
    result = nullptr
    char* var_24
    sub_19ebc4(&var_24, arg1, 0)
    int32_t var_20
    
    if (var_24 != var_20)
        char* r0_13 = *arg1
        
        if (r0_13 == arg1[1] || zx.d(*r0_13) != 0x70)
            result = nullptr
        else
            *arg1 = &r0_13[1]
        label_1a20b2:
            sub_1a0180(arg1)
            result = nullptr
            sub_19ebc4(&var_24, arg1, 0)
            char* r0_5 = *arg1
            
            if (r0_5 != arg1[1])
                if (zx.d(*r0_5) != 0x5f)
                    result = nullptr
                else
                    *arg1 = &r0_5[1]
                    result = sub_1a296c(arg1, &var_24)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
