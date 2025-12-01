// 函数: _ZN14ascensionrules40CStateProcessAcquireOrDefeatAnyCenterRow33SelectAcquireFromDreamscapeToHandER13CStateMachineP6CStateiPj
// 地址: 0x12aa40
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 == 0)
    return 

arg1 = *(arg2 + 0x25c)

if (arg1 s< 1)
    return 

core::CCardInstance* r9_1 = *(arg2 + 0x24c)
void* __offset(CState, 0x2a0) r7_1 = arg2 + 0x2a0
int32_t r1 = 0
ascension::CActiveEffectInstance* r8_1 = *(r9_1 + 4)

do
    if (*(r7_1 - 0x40) == arg3)
        void* r0 = *r7_1
        
        if (r0 == 0xffffffff)
            r0 = memchr(r7_1 - 0x20, 1, *(r7_1 - 0x24)) - (r7_1 - 0x20)
        
        if (zx.d(*(r7_1 + (r0 << 1) - 0x10)) != 0)
            core::CWorldBase::GetInstanceByID(r8_1)
            ascension::CWorld::PlayActiveEffect(r8_1)
        
        int32_t var_24 = 1
        ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
            operator new(0x990), r9_1, arg3, 0x14, zx.d(*(r9_1 + 8)))
        CState::AddOwnedChild(arg2)
        CStateList::AppendState(arg2)
        *(arg2 + 0xcec) = 1
        return 
    
    r1 += 1
    r7_1 += 0x44
while (r1 s< arg1)
