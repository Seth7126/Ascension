// 函数: _ZN14ascensionrules22CStatePlayHeroFromHand9ExitStateER13CStateMachine
// 地址: 0x169288
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (zx.d(*(arg1 + 0xe4)) != 0)
    core::CCardInstance* r6_1 = *(*(arg1 + 0x30) + 4)
    
    if (zx.d(*(r6_1 + 0xa14)) == 0)
        int32_t r0_4 = *(*(r6_1 + 0xb84) - 4)
        
        if ((r0_4 & 4) != 0)
            *(arg1 + 0x34)
            ascension::CWorld::RemovePlayedCard(r6_1)
        else if ((r0_4 & 2) == 0)
            int32_t var_20_1 = 0
            ascension::CWorld::OutputAnimationCard(r6_1, *(arg1 + 0x34), 1, 0xb, 0, 0xa, 0, 0)
    
    *(arg1 + 0x34)
    ascension::CWorld::PopResolveEffect(r6_1)

return CState::ExitState(arg1) __tailcall
