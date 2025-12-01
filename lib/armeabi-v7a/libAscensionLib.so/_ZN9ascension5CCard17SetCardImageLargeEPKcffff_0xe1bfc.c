// 函数: _ZN9ascension5CCard17SetCardImageLargeEPKcffff
// 地址: 0xe1bfc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

unimplemented  {vpush {d8, d9, d10, d11}}
char* entry_r1
strncpy(&arg1[0x188], entry_r1, 0x40)
int96_t q4
q4.d = arg3
q4:8.d = arg2
int32_t entry_r3
int96_t q5
q5.d = entry_r3
arg1[0x1c7] = 0
int32_t entry_r2
q5:8.d = entry_r2
*(arg1 + 0x1cc) = entry_r2
*(arg1 + 0x1d0) = entry_r3
*(arg1 + 0x1d4) = q4:8.d
*(arg1 + 0x1d8) = q4.d

if (*(arg1 + 0x88) != 7)
    strncpy(&arg1[0x2d8], entry_r1, 0x40)
    arg1[0x317] = 0
else
    sprintf(&arg1[0x2d8], "%s_V", entry_r1)

arg1[0x317] = 0
*(arg1 + 0x31c) = q5:8.d
*(arg1 + 0x320) = q5.d
*(arg1 + 0x324) = q4:8.d
*(arg1 + 0x328) = q4.d
unimplemented  {vpop {d8, d9, d10, d11}}
return 0
