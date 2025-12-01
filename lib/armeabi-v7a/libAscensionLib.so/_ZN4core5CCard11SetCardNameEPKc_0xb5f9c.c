// 函数: _ZN4core5CCard11SetCardNameEPKc
// 地址: 0xb5f9c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* entry_r1
strcpy(&arg1[4], entry_r1)
int32_t i = 0
arg1[0x43] = 0

do
    int32_t r1_1 = sx.d(arg1[4 + i])
    
    if (r1_1 == 0)
        break
    
    i += 1
    *(arg1 + 0x84) += i * i * r1_1
while (i u< 0x40)

return i
