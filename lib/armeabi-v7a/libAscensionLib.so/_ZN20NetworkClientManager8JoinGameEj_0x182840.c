// 函数: _ZN20NetworkClientManager8JoinGameEj
// 地址: 0x182840
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t* r0_2

if (zx.d(*(arg1 + 0x8e)) != 0)
    r0_2 = *(arg1 + 4)

int32_t result

if (zx.d(*(arg1 + 0x8e)) != 0 && r0_2 != 0)
    int32_t* r2_1 = *(arg1 + 0xd0)
    int32_t r3_1 = *(arg1 + 0xd4)
    
    if (r2_1 == r3_1)
    label_1828a4:
        *(arg1 + 0x9c) = 1
        result = 0
    else
        while (true)
            int32_t* r5_1 = *r2_1
            r2_1 = &r2_1[1]
            int32_t entry_r1
            
            if (*r5_1 == entry_r1)
                int32_t var_24_1 = 0
                int32_t var_28 = 0xfbfbfbfb
                int32_t var_20_1 = entry_r1
                (*(*r0_2 + 8))(r0_2, &var_28, 0xc)
                *(arg1 + 0x9c) = 0xffffffff
                result = 1
                break
            
            if (r3_1 == r2_1)
                goto label_1828a4
else
    *(arg1 + 0x9c) = 3
    result = 0

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
