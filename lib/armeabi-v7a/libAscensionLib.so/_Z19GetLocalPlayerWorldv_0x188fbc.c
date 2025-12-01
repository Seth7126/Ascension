// 函数: _Z19GetLocalPlayerWorldv
// 地址: 0x188fbc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r0 = *s_pWorldData

if (r0 == 0)
    return 0

return *(r0 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
