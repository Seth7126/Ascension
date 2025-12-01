// 函数: _ZN14ascensionrules45CStateProcessCopyEffectFromTopOfAnyPlayerDeck19BuildCopyOptionListER13CStateMachine
// 地址: 0x150310
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t entry_r10
int32_t var_c = entry_r10
void* r3 = *(arg1 + 0x254)
void* r0 = *(*(arg1 + 0x24c) + 4)

if (r3 != 0)
    entry_r10 = *(r3 + 0xc)

if (r3 == 0)
    entry_r10 = 0

int32_t r0_2 = *(r0 + 0x1c) - *(r0 + 0x18)

if (r0_2 s>= 1)
    int32_t i = 0
    
    do
        void* r0_3 = *(arg1 + 0x258 + (i << 2))
        
        if (r0_3 != 0)
            void* r1_1 = *(r0_3 + 0xc)
            
            if (zx.d(*(r1_1 + 0xc9)) == 0 && r1_1 != entry_r10 && *(r1_1 + 0x88) == 1)
                void* var_2c_1 = r0_3
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_3 + 8), 0xa081, "Copy %s", 
                    ascensionrules::CStateProcessCopyEffectFromTopOfAnyPlayerDeck::SelectEffectToCopy)
        
        i += 1
    while (i s< r0_2 s>> 2)
    
    *(arg1 + 0x24c)

jump(*(*arg1 + 0x34))
