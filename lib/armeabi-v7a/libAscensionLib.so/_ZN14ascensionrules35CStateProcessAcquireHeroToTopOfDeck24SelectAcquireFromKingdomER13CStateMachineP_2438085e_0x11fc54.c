// 函数: _ZN14ascensionrules35CStateProcessAcquireHeroToTopOfDeck24SelectAcquireFromKingdomER13CStateMachineP6CStateiPj
// 地址: 0x11fc54
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r8 = *(arg2 + 0x24c)
uint32_t r5 = *(r8 + 4)

if (*(arg3 + 0x10) s>= 1)
    core::CCardStackUniform::SetCardCount(arg3)

uint32_t r0_3
uint32_t r3
r0_3, r3 = ascension::CCardStackUniformAscension::TakeSampleCardInstance()
void* r0_4 = *(arg3 + 0x14)

if (r0_4 != 0)
    r3 = zx.d(*(r0_4 + 8))

int32_t r0_5 = *(arg3 + 0x10)

if (r0_4 == 0)
    r3 = 0

ascension::CWorld::OutputEvent(r5, 0x21, zx.d(*(arg3 + 8)), r3)

if (*(arg2 + 0x268) != 0)
    ascension::CWorld::PlayActiveEffect(r5)

int32_t* r0_8 = *(arg2 + 0x264)

if (r0_8 != 0)
    void* r2_2 = r0_8 + *r0_8 + 4
    uint32_t r1_3 = zx.d(*r2_2)
    
    if (r1_3 u<= 7)
        uint32_t r3_1 = zx.d(*(r0_3 + 8))
        *r2_2 = r1_3.b + 1
        r0_8[*r0_8 * 8 + r1_3 + 4] = r3_1

if (*(r5 + 0x30) u< 2)
    core::CWorldBase::OutputMessageFormat(r5, "%s acquires %s to top of deck\n", r8 + 0x10, 
        (*(*r0_3 + 0xc))(r0_3), r0_5)
    int32_t var_28_1 = 0
    ascension::CWorld::OutputAnimationCard(r5, r0_3, 3, 6, zx.d(*(arg3 + 8)), 2, zx.d(*(r8 + 8)), 0)
    ascension::CPlayer* r5_1 = operator new(0x38)
    CState::CState()
    *r5_1 = _vtable_for_ascensionrules::CStateProcessAcquireCardToTopOfDeck + 8
    *(r5_1 + 0x30) = r8
    *(r5_1 + 0x34) = r0_3
else
    int32_t r6_2 = 1
    
    if (*(arg2 + 0x258) == 0)
        r6_2 = 2
        
        if (*(arg2 + 0x254) == 0)
            r6_2 = 3
    
    int32_t var_34_1 = r6_2
    ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
        operator new(0x990), r8, r0_3, 6, zx.d(*(arg3 + 8)))

CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
