// 函数: _ZN14ascensionrules31IfYouHaveMoreHonorThanOpponentsEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x101d1c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg1 + 0x1c) != *(arg1 + 0x18))
    int32_t r4_1 = *(arg2 + 0x90)
    int32_t i = 0
    
    do
        void* r0_2 = ascension::CWorld::GetPlayer(arg1)
        
        if (r0_2 != arg2 && *(r0_2 + 0x90) s>= r4_1)
            return 0
        
        i += 1
    while (i u< (*(arg1 + 0x1c) - *(arg1 + 0x18)) s>> 2)

return 1
