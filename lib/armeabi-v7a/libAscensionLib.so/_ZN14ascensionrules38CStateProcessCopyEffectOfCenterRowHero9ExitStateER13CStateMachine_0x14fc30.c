// 函数: _ZN14ascensionrules38CStateProcessCopyEffectOfCenterRowHero9ExitStateER13CStateMachine
// 地址: 0x14fc30
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r1 = *(arg1 + 0x25c)

if (r1 != 0)
    core::CCardInstance* r6_1 = *(*(arg1 + 0x24c) + 4)
    
    if (*(r6_1 + 0x30) u>= 4)
        ascension::CWorld::AddToPlayedCards(r6_1, r1)
        r1 = *(arg1 + 0x25c)
    
    int32_t var_20_1 = 0
    ascension::CWorld::OutputAnimationCard(r6_1, r1, 7, 0xb, 0, 0xa, 0, 0)
    *(arg1 + 0x25c)
    ascension::CWorld::PopResolveEffect(r6_1)

return CGameStateOptions::ExitState(arg1) __tailcall
