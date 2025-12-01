// 函数: sub_db738
// 地址: 0xdb738
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* i = *(arg1 + 0x10) + ((*(arg2 + 8) & not.d(0xffffffff << zx.d(*(arg1 + 7)))) << 5)

do
    if (*(i + 0x18) == 0x44 && *(i + 0x10) == arg2)
        return i
    
    i = *(i + 0x1c)
while (i != 0)

return &data_1d13d0
