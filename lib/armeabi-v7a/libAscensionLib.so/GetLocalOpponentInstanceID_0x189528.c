// 函数: GetLocalOpponentInstanceID
// 地址: 0x189528
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r0 = *s_InterfaceContext

if (r0 != 0)
    int32_t r1_1 = *(s_InterfaceContext + 0xc)
    
    if (r1_1 != 0 && arg1 s< (*(r0 + 0x1c) - *(r0 + 0x18)) s>> 2)
        void* r0_2 = ascension::CWorld::GetPlayerByTurnOrder(r0, r1_1)
        
        if (r0_2 != 0)
            return zx.d(*(r0_2 + 8))

return 0
