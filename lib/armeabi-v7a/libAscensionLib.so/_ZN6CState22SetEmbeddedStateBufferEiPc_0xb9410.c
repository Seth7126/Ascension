// 函数: _ZN6CState22SetEmbeddedStateBufferEiPc
// 地址: 0xb9410
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t entry_r2
int32_t r3 = (entry_r2 + 0xf) & 0xfffffff0
*(arg1 + 0x1c) = (arg2 - entry_r2 + r3) & 0xfffffff0
*(arg1 + 0x20) = r3
