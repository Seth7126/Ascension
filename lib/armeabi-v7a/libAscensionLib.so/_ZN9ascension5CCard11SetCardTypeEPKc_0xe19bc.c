// 函数: _ZN9ascension5CCard11SetCardTypeEPKc
// 地址: 0xe19bc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* entry_r1
int32_t r0_1 = ascension::GetCardTypeFromString(entry_r1)
*(arg1 + 0x88) = r0_1
int32_t result = r0_1 - 1

if (result u<= 1)
    result = 1
    *(arg1 + 0xcc) = 1

return result
