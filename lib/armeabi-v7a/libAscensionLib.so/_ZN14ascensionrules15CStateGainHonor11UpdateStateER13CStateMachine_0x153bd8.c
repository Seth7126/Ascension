// 函数: _ZN14ascensionrules15CStateGainHonor11UpdateStateER13CStateMachine
// 地址: 0x153bd8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CInstance* r2 = *(arg1 + 0x30)
ascension::CPlayer* r6 = *(arg1 + 0x98)
int32_t r7 = *(r2 + 4)

if (*(r7 + 0xb20) == r2)
    r6 *= *(r7 + 0xb5c)

int32_t var_28

if (zx.d(*(r7 + 0xa14)) == 0)
    var_28 = 0
    ascension::CWorld::OutputAnimationHonor(r7, r6, r2, *(arg1 + 0x34))
    
    if (zx.d(*(arg1 + 0x3c)) != 0)
        ascension::CWorld::OutputPauseForAllAnimation()

ascension::CPlayer::AddHonorTokens(*(arg1 + 0x30))
ascension::CWorld::AddHonorGainedThisTurn(r7)
ascension::CWorld::TakeHonorTokenPool(r7)

if (zx.d(*(r7 + 0xa14)) == 0)
    int32_t r5_1 = *(arg1 + 0x34)
    int32_t r0_11 = (*(**(arg1 + 0x30) + 0xc))()
    
    if (r5_1 == 0)
        core::CWorldBase::OutputMessageFormat(r7, "%s gains %d honor tokens\n", r0_11, r6, var_28)
    else
        core::CWorldBase::OutputMessageFormat(r7, "%s gains %d honor tokens from %s\n", r0_11, r6, 
            (*(**(arg1 + 0x34) + 0xc))())
        ascension::CPlayer* var_28_2 = r6
        ascension::CWorld::OutputEvent(r7, 0x1c, zx.d(*(*(arg1 + 0x30) + 8)), 
            zx.d(*(*(arg1 + 0x34) + 8)))

CState* entry_r1
return CStateMachine::PopState(entry_r1) __tailcall
