// 函数: _ZN14ascensionrules35CStateProcessAcquireHeroOrConstruct18AcquireFromKingdomER13CStateMachinePN9ascension26CCardStackUniformAscensionEj
// 地址: 0x122664
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r5 = *(arg1 + 0x24c)
uint32_t r7 = *(r5 + 4)

if (*(arg3 + 0x10) s>= 1)
    core::CCardStackUniform::SetCardCount(arg3)

uint32_t r0_3
uint32_t r3_1
r0_3, r3_1 = ascension::CCardStackUniformAscension::TakeSampleCardInstance()
void* r0_4 = *(arg3 + 0x14)

if (r0_4 != 0)
    r3_1 = zx.d(*(r0_4 + 8))

int32_t r0_5 = *(arg3 + 0x10)

if (r0_4 == 0)
    r3_1 = 0

ascension::CWorld::OutputEvent(r7, 0x21, zx.d(*(arg3 + 8)), r3_1)

if (*(r7 + 0x30) u< 2)
    core::CWorldBase::OutputMessageFormat(r7, "%s acquires %s\n", r5 + 0x10, 
        (*(*r0_3 + 0xc))(r0_3), r0_5)
    int32_t var_28_1 = 0
    ascension::CWorld::OutputAnimationCard(r7, r0_3, 3, 6, zx.d(*(arg3 + 8)), 3, zx.d(*(r5 + 8)), 0)
    ascension::CPlayer* r4_1 = operator new(0xa0)
    CState::CState()
    *r4_1 = _vtable_for_ascensionrules::CStateProcessAcquireCard + 8
    *(r4_1 + 0x30) = r5
    *(r4_1 + 0x34) = r0_3
    *(r4_1 + 0x38) = _vtable_for_ascension::CEventAcquireCard + 8
    *(r4_1 + 0x3c) = 0x12
    *(r4_1 + 0x40) = 0
    *(r4_1 + 0x84) = r5
    *(r4_1 + 0x88) = r0_3
    *(r4_1 + 0x8c) = nullptr
    *(r4_1 + 0x90) = 0
    *(r4_1 + 0x94) = 0
    *(r4_1 + 0x98) = 1
    *(r4_1 + 0x9c) = 0
else
    int32_t r3
    int32_t var_34_1 = r3
    ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
        operator new(0x990), r5, r0_3, 6, zx.d(*(arg3 + 8)))

CState::AddOwnedChild(arg1)
return CStateList::AppendState(arg1) __tailcall
