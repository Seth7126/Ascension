// 函数: _ZN14ascensionrules31CStateUseConstructAbilityEffect9ExitStateER13CStateMachine
// 地址: 0x168dc8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r4 = *(*(arg1 + 0x34) + 0xc)
core::CCardInstance* r6 = *(*(arg1 + 0x30) + 4)
uint32_t r7 = *(r4 + 0x10)

if (ascension::CWorld::IsResolveEffect(r6) != 0)
    if (ascension::CPlayer::HasConstructInPlay(*(arg1 + 0x30)) != 0)
        int32_t var_28_1 = 0
        ascension::CWorld::OutputAnimationCard(r6, r7, 1, 0xb, 0, 4, zx.d(*(r4 + 8)), 0)
    
    ascension::CWorld::PopResolveEffect(r6)

return CState::ExitState(arg1) __tailcall
