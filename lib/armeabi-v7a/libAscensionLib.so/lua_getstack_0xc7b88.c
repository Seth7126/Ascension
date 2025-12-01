// 函数: lua_getstack
// 地址: 0xc7b88
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (arg2 s< 0)
    return 0

void* i = *(arg1 + 0x10)
int32_t lr_1

if (arg2 == 0 || i == arg1 + 0x48)
    lr_1 = arg2
else
    do
        i = *(i + 8)
        lr_1 = arg2 - 1
        
        if (arg2 s< 2)
            break
        
        arg2 = lr_1
    while (i != arg1 + 0x48)

if (lr_1 == 0 && i != arg1 + 0x48)
    result = 1
    *(arg3 + 0x60) = i

return result
