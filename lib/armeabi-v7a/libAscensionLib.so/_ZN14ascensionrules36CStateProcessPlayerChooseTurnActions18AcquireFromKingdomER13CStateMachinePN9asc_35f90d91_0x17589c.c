// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions18AcquireFromKingdomER13CStateMachinePN9ascension26CCardStackUniformAscensionEji
// 地址: 0x17589c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r10 = *(arg1 + 0x24c)
uint32_t r6 = *(r10 + 4)

if (*(arg3 + 0x10) s>= 1)
    core::CCardStackUniform::SetCardCount(arg3)

core::CInstance* r0_3
uint32_t r3
r0_3, r3 = ascension::CCardStackUniformAscension::TakeSampleCardInstance()
void* r0_4 = *(arg3 + 0x14)

if (r0_4 != 0)
    r3 = zx.d(*(r0_4 + 8))

int32_t var_40 = *(arg3 + 0x10)

if (r0_4 == 0)
    r3 = 0

ascension::CWorld::OutputEvent(r6, 0x21, zx.d(*(arg3 + 8)), r3)
int32_t arg_0
void* r0_8 = arg1 + arg_0 * 0x44
int32_t r5_1 = *(r0_8 + 0x264)
int32_t var_3c
int32_t var_38
int32_t var_34

if (r5_1 s>= 1)
    if (zx.d(*(r0_8 + 0x270)) != 0)
        if (*(r6 + 0xb48) s>= 1)
            goto label_175950
        
        ascension::CWorld::RemoveCurrentTurnRunes(r6)
    else if (zx.d(*(r6 + 0xb2b)) == 0 || *(r6 + 0xb48) s< 1)
        ascension::CWorld::RemoveCurrentTurnRunes(r6)
    else
    label_175950:
        var_3c = 0
        var_38 = 2
        var_34 = 0
        ascensionrules::CreateStateMustPayResources(r10, r0_3, r5_1, 0, 0, 0, 2, 0)
        CState::AddOwnedChild(arg1)
        CStateList::AppendState(arg1)

if (*(r6 + 0x30) u< 2)
    core::CWorldBase::OutputMessageFormat(r6, "%s acquires %s (%d runes)\n", r10 + 0x10, 
        (*(*r0_3 + 0xc))(r0_3), r5_1, var_3c, var_38, var_34)
    int32_t var_30_1 = 0
    ascension::CWorld::OutputAnimationCard(r6, r0_3, 3, 6, zx.d(*(arg3 + 8)), 3, zx.d(*(r10 + 8)), 
        0)
    ascensionrules::CreateStateProcessAcquireCard(r10, r0_3)
    CState::AddOwnedChild(arg1)
else
    CState::CleanupEmbeddedState()
    ascensionrules::CreateStateProcessAcquireCardSequence(r10, r0_3, 6, zx.d(*(arg3 + 8)), arg4, 
        *(arg1 + 0x20), *(arg1 + 0x1c))
    CState::SetEmbeddedState(arg1)

return CStateList::AppendState(arg1) __tailcall
