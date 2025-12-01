// 函数: lua_checkstack
// 地址: 0xbc330
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t var_20 = arg2
int32_t r0_1 = *(arg1 + 8)
void* r7 = *(arg1 + 0x10)

if (arg2 s< (*(arg1 + 0x18) - r0_1) s>> 4)
    goto label_bc36c

int32_t result = 0

if (5 + ((r0_1 - *(arg1 + 0x1c)) s>> 4) s<= 0xf4240 - arg2
        && sub_c8cdc(arg1, sub_bc3f8, &var_20) == 0)
    arg2 = var_20
    r0_1 = *(arg1 + 8)
label_bc36c:
    int32_t r0_2 = r0_1 + (arg2 << 4)
    result = 1
    
    if (*(r7 + 4) u< r0_2)
        *(r7 + 4) = r0_2

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
