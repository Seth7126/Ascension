// 函数: lua_settop
// 地址: 0xbc504
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg2 s< 0)
    *(arg1 + 8) = *(arg1 + 8) + (arg2 << 4) + 0x10
    return 

void* i_1 = *(arg1 + 8)
void* r2_2 = **(arg1 + 0x10) + (arg2 << 4)

if (i_1 u< r2_2 + 0x10)
    void* i = i_1
    
    do
        *(i + 8) = 0
        i += 0x10
    while (i u< r2_2 + 0x10)
    
    *(arg1 + 8) = i_1 + ((1 + ((r2_2 + 3 - i_1 + 0xc) u>> 4)) << 4)

*(arg1 + 8) = r2_2 + 0x10
