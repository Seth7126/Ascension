// 函数: _ZN4core10CWorldBase14RemoveInstanceEPNS_9CInstanceE
// 地址: 0xb7b68
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r3 = *(arg1 + 0xc)
void* entry_r1
uint32_t r12 = zx.d(*(entry_r1 + 8))

if (*(r3 + (r12 << 2)) != entry_r1)
    return 0

*(r3 + (r12 << 2)) = 0
return 1
