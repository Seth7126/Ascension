// 函数: _ZN14ascensionrules38PlaceGiantRatOnTopOfEachOtherCenterRowEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x111540
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CEvent* result = arg7

if (*(result + 4) == 0x11)
    int32_t r5_1 = *(result + 0x54)
    result = ascension::CDatabase::GetCard(ascension::g_Database)
    
    for (uint32_t i = 0; i != 7; i += 1)
        if (r5_1 != i)
            if (i u>= 6)
                result = ascension::CWorld::GetCenterRowCard(arg2)
            
            if (i u< 6 || result != 0)
                int32_t r0_3 = ascension::CWorld::CreateCard(arg2)
                ascension::CWorld::PutCardOnCenterRow(arg2, i, r0_3)
                int32_t var_28_1 = 0
                result = ascension::CWorld::OutputAnimationCard(arg2, r0_3, 1, 8, 0, 7, i, 0)

return result
