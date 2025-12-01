// 函数: _ZN14ascensionrules35CStateProcessAcquireHeroToTopOfDeck30SelectAcquireFromKingdomToHandER13CStateMachineP6CStateiPj
// 地址: 0x11faa8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r8 = *(arg2 + 0x24c)
uint32_t r10 = *(r8 + 4)
uint32_t i
uint32_t r3
i, r3 = ascension::CCardStackUniformAscension::TakeSampleCardInstance()

if (*(arg2 + 0x258) == 0)
    int32_t result = *(arg2 + 0x26c)
    
    if (result s< 1)
        return result
    
    void* __offset(CState, 0x2b0) r5_3 = arg2 + 0x2b0
    int32_t r1_8 = 0
    
    while (i != *(r5_3 - 0x40))
        r1_8 += 1
        r5_3 += 0x44
        
        if (r1_8 s>= result)
            return result
    
    void** r9_1 = r5_3
    void* r0_16 = *r9_1
    
    if (r0_16 == 0xffffffff)
        void* r0_18
        r0_18, r3 = memchr(r9_1 - 0x20, 1, *(r5_3 - 0x24))
        r0_16 = r0_18 - (r9_1 - 0x20)
    
    if (zx.d(*(r5_3 + (r0_16 << 1) - 0x10)) != 0)
        core::CWorldBase::GetInstanceByID(r10)
        r3 = ascension::CWorld::PlayActiveEffect(r10)

if (*(arg3 + 0x10) s>= 1)
    r3 = core::CCardStackUniform::SetCardCount(arg3)

void* r0_4 = *(arg3 + 0x14)

if (r0_4 != 0)
    r3 = zx.d(*(r0_4 + 8))

int32_t var_30 = *(arg3 + 0x10)

if (r0_4 == 0)
    r3 = 0

ascension::CWorld::OutputEvent(r10, 0x21, zx.d(*(arg3 + 8)), r3)

if (*(arg2 + 0x268) != 0)
    ascension::CWorld::PlayActiveEffect(r10)

int32_t* r0_8 = *(arg2 + 0x264)

if (r0_8 != 0)
    void* r2_2 = r0_8 + *r0_8 + 4
    uint32_t r1_3 = zx.d(*r2_2)
    
    if (r1_3 u<= 7)
        uint32_t r3_1 = zx.d(*(i + 8))
        *r2_2 = r1_3.b + 1
        r0_8[*r0_8 * 8 + r1_3 + 4] = r3_1

int32_t var_2c = 1
ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
    operator new(0x990), r8, i, 6, zx.d(*(arg3 + 8)))
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
