// 函数: GetPlayerIndexByTurnOrder
// 地址: 0x189588
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *s_InterfaceContext

if (r0 == 0 || *(s_InterfaceContext + 0xc) == 0 || arg1 s>= (*(r0 + 0x1c) - *(r0 + 0x18)) s>> 2)
    return 0

void* r0_2 = ascension::CWorld::GetPlayer(r0)

if (r0_2 != 0)
    return *(r0_2 + 0xc)

return 0
