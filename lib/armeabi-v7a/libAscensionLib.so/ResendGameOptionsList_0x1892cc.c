// 函数: ResendGameOptionsList
// 地址: 0x1892cc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r1 = *(s_InterfaceContext + 0xc)

if (r1 != 0 && *(r1 + 0xc) != 0)
    return GameOptionManager::ResendAllOptions(*(s_InterfaceContext + 8)) __tailcall

return s_InterfaceContext
