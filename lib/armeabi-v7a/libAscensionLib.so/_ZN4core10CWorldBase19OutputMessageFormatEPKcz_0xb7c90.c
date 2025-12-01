// 函数: _ZN4core10CWorldBase19OutputMessageFormatEPKcz
// 地址: 0xb7c90
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r3
int32_t var_4 = r3
int32_t entry_arg
int32_t arg = entry_arg

if (zx.d(arg1[0xa14]) == 0 && *(arg1 + 0xa04) != 0)
    int32_t* var_128_1 = &arg
    char str[0x100]
    char* entry_format
    vsprintf(&str, entry_format, &arg)
    int32_t r2_1 = *(arg1 + 0xa04)
    
    if (r2_1 != 0)
        r2_1(*(arg1 + 0xa08), &str)

int32_t r0_5 = *__stack_chk_guard

if (r0_5 == r0)
    return r0_5 - r0

__stack_chk_fail()
noreturn
