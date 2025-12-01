// 函数: _ZN6CState20CleanupEmbeddedStateEv
// 地址: 0xb9230
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t* r0 = *(entry_r0 + 0x24)

if (r0 != 0)
    if (zx.d(r0[0xb].b) == 0)
        r0[0xb].b = 1
        (**r0)()
    else
        (*(*r0 + 4))()

*(entry_r0 + 0x24) = 0
return 0
