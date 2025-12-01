// 函数: _ZN4core10CWorldBase16RollbackInstanceEPNS_9CInstanceE
// 地址: 0xb7f2c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* entry_r1
uint32_t r3 = zx.d(entry_r1[2].w)
*(*(arg1 + 0xc) + (r3 << 2)) = 0
*(arg1 + 4) = r3

if (entry_r1 == 0)
    return 

jump(*(*entry_r1 + 4))
